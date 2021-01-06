const express = require('express');
const app = express();

app.use(express.json());
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended: true}));

// const userRoute = require('./src/routes/Users');

// app.use('/users' , userRoute);

app.listen(process.env.PORT || 7071,()=>{
    console.log(`API Server is Listening at http:/localhost:3001`);
});