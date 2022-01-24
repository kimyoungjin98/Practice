const express = require("express");
const router = express.Router();
const wss = require("ws").Server;

/* GET home page. */
router.get("/", function (req, res, next) {
  //   wss.on("connection", (ws, req) => {
  //     console.log("커넥션2");

  //     ws.on("message", (msg) => {
  //       console.log("메시지 보내기 : " + msg);
  //     });
  //   });
  res.render("index", { title: "Express" });
});

module.exports = router;
