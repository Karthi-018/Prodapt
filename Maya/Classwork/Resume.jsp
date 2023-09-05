<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>My Resume</title>
    <style>


        h1 {
            text-align: center;
            font-size: 24px;
            font-weight: bold;

        }

        table {
            width: 100%;

        }

        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: center;
        }

        th {
            background-color: #f2f2f2;
        }



        .contact-info {
            display: flex;
            justify-content: space-between;
            margin-top: 20px;
            font-weight: bold;
        }


        .center {
            width: 80%;
            margin: 0 auto;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }

        .image-container {
            display: flex;
            justify-content: space-between;
            margin-bottom: 20px;
        }

        .image-container img {
            height: 100px;
        }

        .image-container h1 {
            display: inline;
            margin-left: 100px;
        }

        .objective {
            margin-top: 20px;
        }

        .objective h2 {
            font-size: 20px;
            font-weight: bold;
        }
    </style>
</head>
<body>
<div class="center">
    <div class="image-container">
        <img src="https://cdn-icons-png.flaticon.com/512/3135/3135715.png">
        <h1>My Resume</h1>
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjtlOsXGhpehTts-BPzXkCWKYzuzYW8uPS5MJhCjZpWg&s">
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9oLa-EBtMjoty7FnDwVLNzuq4A4_W0EwUMYv2bOnnlw&s">
    </div>

    <div class="contact-info">
        <div>Ph: 8825614225</div>
        <div>Email: sandymaya060901@gmail.com</div>
    </div>

    <hr>

    <div class="objective">
        <h2>Objective:</h2>
        <p>To use my strong computer science skills to develop innovative software solutions for a major tech company.</p>
    </div>

    <div>
        <h2>Education Details</h2>
        <table>
            <tr>
                <th>SNO</th>
                <th>Qualification</th>
                <th>College</th>
                <th>%</th>
            </tr>
            <tr>
                <td>1</td>
                <td>BE</td>
                <td>Rajalakshmi Institute of Technology</td>
                <td>87%</td>
            </tr>
            <tr>
                <td>2</td>
                <td>SSC</td>
                <td>SBOA School and Junior College</td>
                <td>82.5%</td>
            </tr>
        </table>
    </div>

    <div>
        <h2>Hobbies:</h2>
        <ul>
            <li>Cycling</li>
            <li>Listening to music</li>
        </ul>
    </div>

    <div>
        <h2>Personal Information</h2>
        <ul>
            <li>Name: Maya Padhy</li>
            <li>Email: sandymaya060901@gmail.com</li>
            <li>Phone: 8825614225</li>
        </ul>
    </div>

    <div>
        <h2>Certifications</h2>
        <ul>
            <li>Python</li>
            <li>Java</li>
        </ul>
    </div>
</div>
</body>
</html>
