const express = require('express');
const exphbs = require('express-handlebars');
const app = express();
const path=require('path');

const publicPath = path.resolve(__dirname, "public");
app.use(express.static(publicPath)); 


app.use(express.static(path.join(__dirname, '/public')));

app.engine('handlebars', exphbs());
app.set('view engine', 'handlebars');

//app.use('/admin/view', require('./routes/view.route'));


const homeRouter=require('./routes/home.route')
app.use('/',homeRouter);

const viewRouter=require('./routes/view.route')
app.use('/',viewRouter);


const addRouter=require('./routes/add.route')
app.use('/',addRouter);

const removeRouter=require('./routes/remove.route')
app.use('/',removeRouter);

const updateRouter=require('./routes/update.route')
app.use('/',updateRouter);

app.use(function (req, res) {
  res.render('404', {
    layout: false
  });
})


const PORT = 1000;
app.listen(PORT, function () {
  console.log(`Server is running at http://localhost:${PORT}`);
})