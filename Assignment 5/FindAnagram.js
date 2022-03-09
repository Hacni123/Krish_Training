function sortmy(arr) {
    
    for (i = 0; i < arr.length; i++) {
        for (j = 0; j < arr.length; j++) {
            if (arr[j] > arr[i]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    return arr.join("");
}

function anagramChecker(str1, str2){

    let string1=str1.replace(' ', '').toLowerCase().split('')
    let strin1sort=sortmy(string1)

    let string2=str2.replace(' ', '').toLowerCase().split('')
    let strin2sort=sortmy(string2)
    
  
  // check if the two strigns are similar
    if(strin1sort === strin2sort){
      return(`${str1} and ${str2} are anagrams`)
    }else{
      return(`${str1} and ${str2} are not anagrams`)
    }
  }
  
  

  const readline = require('readline')

const inquirer = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

inquirer.question("Enter your first word ?", anagm1 => {
  inquirer.question("Enter your second word?", anagm2 => {
      console.log(anagramChecker(anagm1,anagm2))
      inquirer.close();
  });
});

inquirer.on("close", function() {
  process.exit(0);
});
  