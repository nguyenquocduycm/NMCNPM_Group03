const express=require('express');

const router = express.Router();

router.get('/add', function (req, res) {
    // res.send('hello expressjs');
    res.render('add');
})
  
module.exports=router;