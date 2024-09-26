<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Airline Ticket Booking</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 20px;
        }
        .container {
            max-width: 600px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
        }
        form {
            display: flex;
            flex-direction: column;
        }
        label {
            margin: 10px 0 5px;
        }
        input, select, button {
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 16px;
        }
        button {
            background-color: #4CAF50;
            color: white;
            cursor: pointer;
        }
        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Airline Ticket Booking</h2>
    <form action="/submit-booking" method="POST">
        <!-- Personal Information -->
        <label for="full_name">Full Name:</label>
        <input type="text" id="full_name" name="full_name" placeholder="Enter your full name" required>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" placeholder="Enter your email" required>

        <label for="phone">Phone Number:</label>
        <input type="tel" id="phone" name="phone" placeholder="Enter your phone number" required>

        <!-- Travel Information -->
        <label for="departure_city">Departure City:</label>
        <input type="text" id="departure_city" name="departure_city" placeholder="Enter departure city" required>

        <label for="arrival_city">Arrival City:</label>
        <input type="text" id="arrival_city" name="arrival_city" placeholder="Enter arrival city" required>

        <label for="departure_date">Departure Date:</label>
        <input type="date" id="departure_date" name="departure_date" required>

        <label for="return_date">Return Date (optional):</label>
        <input type="date" id="return_date" name="return_date">

        <!-- Flight Preferences -->
        <label for="class">Class:</label>
        <select id="class" name="class" required>
            <option value="economy">Economy</option>
            <option value="business">Business</option>
            <option value="first_class">First Class</option>
        </select>

        <label for="seats">Number of Seats:</label>
        <input type="number" id="seats" name="seats" min="1" max="10" value="1" required>

        <!-- Submit Button -->
        <button type="submit">Book Now</button>
    </form>
</div>

</body>
</html>
