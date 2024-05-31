<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>Spring WebSocket Chat Demo</h1>
    <p>This is a simple group chat application built using Spring Boot and WebSocket. The project demonstrates how to set up a real-time chat service where multiple users can join a chat room and communicate with each other.</p>
    <h2>Features</h2>
    <ul>
        <li><strong>Real-time Messaging</strong>: Send and receive messages instantly with WebSocket.</li>
        <li><strong>Multiple Users</strong>: Supports multiple users joining the chat room.</li>
        <li><strong>User-Friendly Interface</strong>: Simple and intuitive front-end interface for chatting.</li>
        <li><strong>Spring Boot Integration</strong>: Leverages the power of Spring Boot for the backend.</li>
    </ul>
    <h2>Technologies Used</h2>
    <ul>
        <li><strong>Spring Boot</strong>: For the backend framework.</li>
        <li><strong>WebSocket</strong>: For real-time communication.</li>
        <li><strong>HTML, CSS, JS</strong>: For the frontend.</li>
    </ul>
    <h2>Getting Started</h2>
    <h3>Prerequisites</h3>
    <ul>
        <li>Java 11 or higher</li>
        <li>Maven</li>
    </ul>
    <h3>Installation</h3>
    <ol>
        <li>Clone the repository:
            <pre><code>git clone https://github.com/PhuongTay1109/spring-websocket-chat-demo.git
cd realtime-chat
            </code></pre>
        </li>
        <li>Build the project:
            <pre><code>mvn clean install
            </code></pre>
        </li>
        <li>Run the application:
            <pre><code>mvn spring-boot:run
            </code></pre>
        </li>
        <li>Open your browser and navigate to <a href="http://localhost:8080">http://localhost:8080</a> to access the chat application.</li>
    </ol>
    <h2>Usage</h2>
    <ol>
        <li>Open the chat application in your browser.</li>
        <li>Enter your username and join the chat room.</li>
        <li>Start sending messages and see them appear in real-time.</li>
    </ol>
</body>
</html>
