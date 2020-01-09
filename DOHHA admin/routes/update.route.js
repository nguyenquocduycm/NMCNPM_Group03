const express = require('express');
const sysModel=require('../models/account.model')

const router = express.Router();

// router.get('/update',async function(req,res){
//     const results=await sysModel.viewAllUser();
//     res.render('update',{
//         memberInfo:results,
//         empty:results.length===0
//     })
// })

// router.post('/update',async function(req,res){
//     const res=await accountModel.updateRole(req.body);
//     res.redirect('/');
// })  


module.exports=router;