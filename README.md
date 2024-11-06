<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HealthyRecipesApp</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            color: #333;
            margin: 0;
            padding: 0;
            line-height: 1.6;
        }
        header {
            background-color: #4CAF50;
            color: #fff;
            padding: 20px;
            text-align: center;
        }
        h1 {
            margin: 0;
        }
        h2 {
            color: #4CAF50;
        }
        .container {
            max-width: 960px;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        ul {
            list-style-type: none;
            padding: 0;
        }
        li {
            margin-bottom: 10px;
        }
        code {
            background-color: #f4f4f4;
            padding: 5px;
            border-radius: 5px;
        }
        .feature-list {
            padding-left: 20px;
        }
        footer {
            background-color: #4CAF50;
            color: white;
            padding: 10px;
            text-align: center;
        }
    </style>
</head>
<body>

<header>
    <h1>HealthyRecipesApp</h1>
    <p>Discover, order, and enjoy healthy recipes easily!</p>
</header>

<div class="container">
    <h2>Features</h2>
    <p>HealthyRecipesApp offers an easy-to-use interface for discovering healthy foods, learning about their benefits, and placing orders. The app is divided into three main activities:</p>
    
    <ul class="feature-list">
        <li><strong>1. Search Food Activity</strong>
            <ul>
                <li>Search for healthy recipes using filtering options like <code>Spinner</code>, <code>Combo Box</code>, and <code>Radio Buttons</code>.</li>
                <li>Read food details such as descriptions, health benefits, and nutritional facts.</li>
                <li>If you like a recipe, add it to your order list.</li>
                <li>View the order summary with the total price.</li>
            </ul>
        </li>
        
        <li><strong>2. List View of Foods</strong>
            <ul>
                <li>Browse a list of available recipes.</li>
                <li>Tap on any food item to view its details and place an order.</li>
                <li>Get detailed nutritional facts and benefits before making an order.</li>
            </ul>
        </li>
        
        <li><strong>3. About Page</strong>
            <ul>
                <li>Learn about the creator, <strong>Musa Shuaib</strong>.</li>
                <li>Get an overview of the app's design and features.</li>
            </ul>
        </li>
    </ul>

    <h2>Layouts</h2>
    <p>The app uses the following layouts for UI design:</p>
    <ul>
        <li><strong>LinearLayout:</strong> A simple layout that arranges the child elements in a single direction, either vertically or horizontally.</li>
        <li><strong>ConstraintLayout:</strong> A flexible and efficient layout that allows you to design complex UIs with more control over positioning and performance.</li>
    </ul>

    <h2>Getting Started</h2>
    <p>Follow these steps to get started:</p>
    <ul>
        <li><strong>Clone the Repository:</strong>
            <pre><code>git clone https://github.com/yourusername/HealthyRecipesApp.git</code></pre>
        </li>
        <li><strong>Open in Android Studio:</strong> Open the project in Android Studio to explore the code and run it on an emulator or physical device.</li>
        <li><strong>Build and Run:</strong> Build the app in Android Studio and run it on your preferred device.</li>
    </ul>

    <h2>Screenshots</h2>
    <p>Here are some screenshots of the app:</p>
    <ul>
        <li><strong>Search Food Activity:</strong> Displays the search filters and food details.</li>
        <li><strong>Order Summary Activity:</strong> Shows the list of foods ordered with the total cost.</li>
        <li><strong>List View of Foods:</strong> A user-friendly list of all available recipes.</li>
    </ul>

    <h2>Technologies Used</h2>
    <ul>
        <li><strong>Java/Kotlin:</strong> For app logic and UI design.</li>
        <li><strong>XML:</strong> For layout design using <code>LinearLayout</code> and <code>ConstraintLayout</code>.</li>
        <li><strong>Android Studio:</strong> The primary IDE used for development.</li>
    </ul>

    <h2>Creator</h2>
    <p>This application was designed and developed by <strong>Musa Shuaib</strong>. Connect to learn more about the developer and the inspiration behind HealthyRecipesApp.</p>
</div>

<footer>
    <p>&copy; 2024 HealthyRecipesApp. All Rights Reserved.</p>
</footer>

</body>
</html>
