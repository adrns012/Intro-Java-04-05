// Submit all inputs + select option via "Calculate Tip" button
window.onload = () => {
  document.querySelector("#calculate").onclick = tipCalc;
}

// Calculate the Tip amount and the Total Bill amount
function tipCalc() {
  var noTipBill = parseInt(document.querySelector("#bill-amount").value);

  var serviceQuality = (document.querySelector("#service-quality").value);

  var qualityOfService = parseInt(serviceQuality).toFixed(2);

  var parties = parseInt(document.querySelector("#split-parties").value);

 /*  if (noTipBill === 0 && qualityOfService === 0 && parties === 0) {
    alert("Please enter a value greater than 0 into all fields");
    return;
  } */

  console.log(typeof noTipBill);
  console.log(typeof qualityOfService);
  console.log(typeof parties);
  console.log(noTipBill);
  console.log(serviceQuality);
  console.log(parties);

  // calculate tip
  let tip = noTipBill * serviceQuality;
  let total = (noTipBill + tip) / parties;
  console.log(tip);
  console.log(total);

  if (total <= 0 || total == NaN || parties === 0 || total == "") {
    alert("Please enter valid values");
  }

// Displays the total and the tip
  document.getElementById("tip").innerHTML= 'Tip Due - $'+tip;
  document.getElementById("total").innerHTML= 'Total Due - $' + total + ' per person';
}