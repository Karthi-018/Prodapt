var mysql = require('mysql');

var con = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "hr",
  port:3306,
  database:"angular"
});

con.connect(function(err) {
  if (err) throw err;
  console.log("Connected!!!!!");
}); 
function Createproduct(pro, callback)
{
  sql = "insert into product values('"+pro.pid+"','"+pro.pname+"','"+pro.des+"','"+pro.cato+"','"+pro.price+"','"+pro.qty+"')";
  console.log(pro);
con.query(sql, function (err, result) {
  if (err) throw err;
  console.log("Inserted: " );
  callback(result);
});
}

function getProducts(callback)
{
    sql = 'select * from product';
    var response ;
    con.query(sql, function (err, result) {
      if (err) throw err;
      console.log("Get All products : " );
      // console.log(result);
      callback(result);
    });
}
function deleteProduct(id,callback)
{
    sql = `delete from product where pid ='${id}'`;
    console.log(sql);
    con.query(sql, function (err, result) {
      if (err) throw err;
      console.log("deleted: " );
      callback('deleted');
    });
}
function getProductById(id,callback)
{
    sql = `select * from product where pid = '${id}'`;
    var response ;
    con.query(sql, function (err, result) {
      if (err) throw err;
      console.log("Get Blog for Id: "+id );
      callback(result);
    });
}
function updateProduct(id, callback)
{
    sql = "update product set price='"+updateProduct.price+"',qty='"+updateProduct.qty+"' where pid='"+updateProduct.pid+"'";
    console.log(sql);
    con.query(sql, function (err, result) {
      if (err) throw err;
      console.log("Updatng DB: " );
      callback(result);
    });
}

// function addEmployees(blog, callback)
// {
//     sql = "insert into employees values('"+empty.eid+"','"+empty.ename+"','"+empty.sal+"','"+b+"','"+blog.category+"')";
//       console.log(blog);
//     con.query(sql, function (err, result) {
//       if (err) throw err;
//       console.log("Inserted: " );
//       callback(result);
//     });
// }


//exports.getEmployees = getEmployees;
// exports.addEmployees = addEmployees;
//exports.getEmployee = getEmployee;
// exports.editEmployee = editEmployee;
exports.Createproduct = Createproduct;
exports.getProducts = getProducts;
exports.deleteProduct = deleteProduct;
exports.updateProduct = updateProduct;
exports.getProductById = getProductById;
