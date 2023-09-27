var mysql = require('mysql');

var con = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "hr",
  port:3306,
  database:"angular_db"
});

con.connect(function(err) {
  if (err) throw err;
  console.log("Connected!!!!!");
}); 

function getProducts(callback)
{
    sql = 'select * from product';
    var response ;
    con.query(sql, function (err, result) {
      if (err) throw err;
      console.log("Get All Products : " );
      // console.log(result);
      callback(result);
    });
}
function getProductId(id,callback)
{
    //sql = 'select * from employees where eid = '+id; 

    sql = "select * from product where id = '"+id+"'";
    var response ;
    con.query(sql, function (err, result) {
      if (err) throw err;
      console.log("Get Blog for Id: "+id );
      callback(result);
    });
} 

function searchProduct(searchItem,callback)
{  
  searchItem=searchItem.toUpperCase(); 
  sql = 'select * from product where upper(name) like "%'+searchItem.toUpperCase()+'%"'+'or upper(category) like "%'+searchItem.toUpperCase()+'%"';

  console.log(sql);

  var response ;
    // sql = "select * from product where upper(name) like ? or category like ? ";
    // var response ;
    con.query(sql,[searchItem],function (err, result) 
    {
      if (err) {
        console.log("Error:",err.message);
        return callback([]);

      }
      console.log("Search Item returned successfully "+ searchItem.toUpperCase());
      callback(result);
    });
}

function addProduct(blog, callback)
{
    sql = "insert into product values('"+blog.id+"','"+blog.name+"','"+blog.description+"','"+blog.category+"','"+blog.price+"','"+blog.quantity+"')";

      console.log(blog);

    con.query(sql, function (err, result) {

      if (err) throw err;

      console.log("Inserted: " );

      callback(result);

    });

}
function editProduct(obj, callback)
{
  console.log('values are '+obj[0]+''+obj[1]+''+obj[2]);

  sql = `update product set price=${obj[0]},quantity=${obj[1]} where id='${obj[2]}'`;

  con.query(sql, function (err, result) {

    if (err) throw err;

    console.log("Updating DB: " );

    callback(result);

  });
}
function deleteProduct(id,callback)
{
    sql = `delete from product where id ='${id}'`;
    con.query(sql,function(err,result)
    {
      if(err)
      {
        console.log("Error:",err.message)
        return callback("Error Deleting product")
      } 
      else
      {
        console.log(result)
      }
    });
   console.log("Deleted the product id:",id);
   callback("Product deleted successfully");
}
exports.getProducts = getProducts;
exports.addProduct = addProduct;
exports.deleteProduct = deleteProduct;
exports.getProductId = getProductId; 
exports.searchProduct = searchProduct;
exports .editProduct=editProduct;
// exports.editEmployee = editEmployee;