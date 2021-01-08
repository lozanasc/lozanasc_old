const express = require('express');
const router = express.Router();

// * Basic Backend Services:
const Enroll = require('../services/student/student.add');
const Edit = require('../services/student/student.modify');
const Drop = require('../services/student/student.delete');
const View = require('../services/student/student.view');

// router.get('/View', (req, res) => {
//     const {} = req.params;
//     const ViewStudent = await View();
// });

router.post('/enroll', async(req,res) => {
    const { Name, Password, FullName, Address} = req.body;
    const AddingStudentData = await Enroll(Name, Password, FullName, Address);
    if(AddingStudentData){
        res.status(200)
        .send(
            {
                'enrollment_status': AddingStudentData,
                'enrollment_description': 'Enrolling of Student Information is Successful!'
            }
        )
    }
    else{
        res.status(500)
        .send(
            {
                'enrollment_status': AddingStudentData,
                'enrollment_description': 'Enrolling of Student Information is Unsuccessful!'
            }
        )
    }
})

module.exports = router;

