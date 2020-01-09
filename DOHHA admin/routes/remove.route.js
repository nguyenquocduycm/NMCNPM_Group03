const express=require('express');

const router = express.Router();

router.get('/remove', function (req, res) {
    // res.send('hello expressjs');
    res.render('remove');
})
  


module.exports=router;