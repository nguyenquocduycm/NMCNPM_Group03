var mysql=require('mysql');
var util=require('util');
const pool=mysql.createPool({
    connectionLimit : 100,
    host:'localhost',
    port:3308,
    user:'root',
    password:'',
    database:'ddoha'   
});

const pool_query=util.promisify(pool.query).bind(pool);

module.exports={
  load:sql=>pool_query(sql),
  add: (entity,table)=> pool_query(`insert into ${table} set ?`,entity),
  del: (condition, table) => pool_query(`delete from ${table} where ?`, condition),
  update: (entity, condition, table) => pool_query(`update ${table} set ? where ?`, [entity, condition]),
};
// let query = 'SELECT * FROM account';
// conn.query(query, (error, results, fields) => {
//   if (error) {
//     return console.error(error.message);
//   }
//   console.log(results);
// });

// conn.end();