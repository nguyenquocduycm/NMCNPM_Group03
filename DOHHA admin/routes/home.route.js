const express=require('express');
const sysModel=require('../models/account.model')

const router = express.Router();

router.get('/', async function (req, res) {
//res.render('home');

    const results=await sysModel.viewAccountInfo();
    res.render('home',{
        accountInfo:results,
        empty:results.length===0
    })
})
  
module.exports=router;