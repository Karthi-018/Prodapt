var mysql = require('mysql');

var con = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "hr",
  port:3306,
  database:"angular_ecom"
});

con.connect(function(err) {
  if (err) throw err;
  console.log("Connected!!!!!");
}); 

function viewProducts(callback)
{
    sql = 'select * from ecom';
    var response ;
    con.query(sql, function (err, result) {
      if (err) throw err;
      console.log("Get All Employees : " );
      // console.log(result);
      callback(result);
    });
}
function searchProduct(name,callback)
{
    console.log(name); 
    sql = 'select * from ecom where pname like "%'+name+'%"';
    console.log(sql);
    var response ;
    con.query(sql,[name], function (err, result) {
      if (err) throw err;
      console.log("Get Blog for Id: "+name );
      callback(result);
    });
}
function addProduct(obj, callback)
{
    sql = "insert into ecom values('"+obj.pid+"','"+obj.pname+"','"+obj.pdesc+"',"+obj.price+","+obj.quantity+",'"+obj.category+"')";
    console.log(obj);
    con.query(sql, function (err, result) {
      if (err) throw err;
      console.log("Inserted: " );
      callback(result);
    });
}
// function editProduct(obj, callback)
// {
//     sql = "update ecom set price = "+obj.price+",quantity="+obj.qty+" where pid = '"+obj.pid+"'";
//     console.log(sql);
//     con.query(sql, function (err, result) {
//       if (err) throw err;
//       console.log("Updatng DB: " );
//       callback(result);
//     });
// }
function deleteProduct(id,callback)
{
    sql = `delete from ecom where pid = '${id}'`;
    console.log(sql);
    con.query(sql, function (err, result) {
      if (err) throw err;
      console.log("deleted: " );
      callback('deleted');
    });
}

function getProduct(id,callback)

{
    sql = `select * from ecom where pid ='${id}'`;
    var response ;
    con.query(sql, function (err, result) {
      if (err) throw err;
      console.log("Get Blog for Id: "+id );
      callback(result);
    });
}
function editProduct(obj,callback)

{
    sql = `update ecom set price=${obj.price},quantity=${obj.quantity} where pid='${obj.id}'`;
    console.log(obj);
    con.query(sql, function (err, result) {
      if (err) throw err;
      console.log("Updating DB: " );
      callback(result);
    });

}
exports.viewProducts = viewProducts;
exports.addProduct = addProduct;
exports.deleteProduct = deleteProduct;
exports.searchProduct = searchProduct;
exports.editProduct = editProduct;
exports.getProduct=getProduct;