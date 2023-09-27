var db = require('./dbdemo')
const jwt = require('jsonwebtoken')
var appRouter = function(app) {
    app.get("/", function(req, res) {
        db.viewProducts(function(data){
            let payload = {subject: 1}
        let token = jwt.sign(payload, 'secretKey')
        // res.status(200).send({token})
            res.send(data);
        });
    });
    app.post("/", function(req, res) {      
        var temp = req.body;
        console.log(req.body.name);
        db.addProduct(temp, function(resp){
            res.send(resp);
        });
    });
    app.put("/", function(req, res) {      
        var temp = req.body;
        console.log('Edit API');
        console.log(temp);
        db.editProduct(temp, function(resp){
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
    app.get("/:name", function(req, res) {     
        console.log("Get single Employee"); 
        var temp = req.params.name;
        console.log("temp")
        db.searchProduct(temp, function(resp){
            console.log(resp);
            res.send(resp);
        });
    });
    

    app.put("/product/:id", function(req, res) {      
        var temp = req.body;
        var prodId=req.id;
        console.log(prodId)
        console.log('Edit API');
        console.log(temp);
        db.editProduct(temp, function(resp){
            res.send(resp);
        });
    });
    app.get("/product/:id", function(req, res) {    
        console.log("Get single Employee");
        var temp = req.params.id;
        db.getProduct(temp, function(resp){
            console.log(resp);
            res.send(resp);
        });
    });
}
module.exports = appRouter;