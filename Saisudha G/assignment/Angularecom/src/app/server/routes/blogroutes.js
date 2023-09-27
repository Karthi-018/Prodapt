var db = require('./dbdemo')
const jwt = require('jsonwebtoken')
var appRouter = function(app) {
    app.get("/", function(req, res) {
        db.getProducts(function(data){
            let payload = {subject: 1}
        let token = jwt.sign(payload, 'secretKey')
        // res.status(200).send({token})
            res.send(data);
        });
    });
    app.post("/", function(req, res) {      
        const pro = req.body;
        console.log(pro);
        db.Createproduct(pro, function(resp){
            res.send(resp);
        });
    });
    app.get("/products/:id", function(req, res) {     
        console.log("Get single Employee"); 
        var temp = req.params.id;
        db.getProductById(temp, function(resp){
            console.log(resp);
            res.send(resp);
        });
    });
    app.put("/products/:id", function(req, res) {      
        const productlist = req.body;
        console.log('Edit API');
        console.log(productlist);
        db.updateProduct(update, function(resp){
            res.send(resp);
        });
    });
    app.delete("/:id", function(req, res) {     
            console.log("delete"); 
            var temp = req.params.id;
            db.deleteProduct(temp, function(resp){
                res.send(resp);
            });
    });
   
}
module.exports = appRouter;