const db=require('../database/db');

module.exports ={
    viewAccountInfo:_=>db.load('select * from `login` LIMIT 5'),
    updateRole: entity =>{
        const condition={}
    }
};