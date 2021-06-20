// Greetings to the user
const greeting = "Hello World";
console.log('I just wanted to say, ' + greeting);
console.log('I\'m going to download some pictures now.... but first,');
console.log('My hope is that you emjoy these images!');

// Declare callback function to download URLs, set on a 3 second timeout
function download(url, callback) {
    setTimeout(() => {
        // script to download the picture here
        console.log(`Downloading ${url} ...`);
        // process the picture once it is completed
        callback(url);
    }, 3000);
}

// Declare URLs as constant variables
const url1 = 'https://dogtime.com/assets/uploads/2019/09/german-sheprador-mixed-dog-breed-pictures-cover.jpg';
const url2 = 'https://www.k9web.com/wp-content/uploads/2019/03/German-Shepherd-Lab-Mix-1-500x625.jpg';
const url3 = 'https://www.k9web.com/wp-content/uploads/2019/03/German-Shepherd-Lab-Mix-German-Shepherd.jpg';

// Download each URL through callback requests
download(url1,function(getPic){
    console.log(`Processing ${getPic}`);
    // download the second picture
    download(url2,function(getpic){
        console.log(`Processing ${getpic}`);
        // download the third picture
        download(url3,function(getPic){
            console.log(`Processing ${getPic}`);
            document.querySelector('#pic').style.display = 'block';
            document.querySelector('#pic2').style.display = 'block';
            document.querySelector('#pic3').style.display = 'block';
        });
    });
});

