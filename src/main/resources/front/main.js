// const socket = new SockJS("http://localhost:8080/ws");
// const stompClient = Stomp.over(socket);
//
// stompClient.connect({}, function (frame) {
//     console.log("Connected: " + frame);
//
//     // Subscribe to notifications
//     stompClient.subscribe("/topic/notifications", function (message) {
//         console.log("Received: " + message.body);
//     });
// });
//
// // Send a notification
// function sendNotification() {
//     stompClient.send("/app/notify", {}, "Hello, WebSocket!");
// }
