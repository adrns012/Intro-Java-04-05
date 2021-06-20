// // Creates close button and attaches to each list element
// var nodeList = document.querySelectorAll("li")
// var i;
// for (i = 0; i < nodeList.length; i++) {
//   var button = document.createElement("button");
//   var txt = document.createTextNode("\u00D7");
//   button.className = "close";
//   button.appendChild(txt);
//   nodeList[i].appendChild(button);
// }
// Hides list item on click
var close = document.getElementsByClassName("close");
var i;
for (i = 0; i < close.length; i++) {
  close[i].onclick = function () {
    var parent = this.parentElement;
    parent.remove();
  };
}
// Adds checkmark to list item upon click
var list = document.querySelector("ul");
var elem = document.querySelector("li");
list.addEventListener("click", function (ev) {
  if (ev.target.tagName === "LI") {
    ev.target.classList.toggle("checked");
    setTimeout(function(){ev.target.remove()}, 1000); 
  }
  var parent = this.parentElement;
  parent.remove;
});
// New list item on "+" button click
function newElement() {
  var li = document.createElement("li");
  var inputValue = document.getElementById("listInput").value;
  var t = document.createTextNode(inputValue);
  li.appendChild(t);
  if (inputValue === '') {
  alert("You must write something!");
  } else {
    document.getElementById("toDoList").appendChild(li);
  }
  document.getElementById("listInput").value = "";
  for (i = 0; i < close.length; i++) {
    close[i].onclick = function() {
        var parent = this.parentElement;
        parent.remove();
    }
  }
}

