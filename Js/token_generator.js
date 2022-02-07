

function generateToken(len,lower,upper,num)

{
    
    
    let params = [lower,upper,num];
    let newParams = [];
    let token = [];
    

    const chars = [
        
        "abcdefghijklmnopqrstuvwxyz",
         "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
         "0123456789"
    ];
    
    
    for (let i = 0; i < params.length; i++)
{
    
    switch (params[i])
    
{
        
        case true:
            newParams.push(chars[i]);
            break;
        
        default:
            // no default action actually
            

 }
    
    

}

    let newStr = newParams.join("");    
        
    for (let j = 0; j < len; j++)
    
{
    let rand = Math.floor(Math.random() * newStr.length);
    token[j] = newStr[rand];
}



switch(arguments.length){
    case 0: return generateToken(8,true,true,true);
    break;
    case 1: return generateToken(len,true,true,true);
    break;
    default: return token.join("");
}
}

console.log(generateToken())
console.log(generateToken(30))
console.log(generateToken(15,false,false,true))