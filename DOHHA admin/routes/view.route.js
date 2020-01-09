const express = require('express');
const sysModel=require('../models/account.model')

const router = express.Router();

router.get('/view',async function(req,res){
    const results=await sysModel.viewAccountInfo();
    res.render('view',{
        memberInfo:results,
        empty:results.length===0
    })
})