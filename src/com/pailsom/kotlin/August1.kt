package com.pailsom.kotlin

fun main(args: Array<String>) {

    var solution = August1Solution()
    println(" Flag word is Capital : ${solution.detectCapitalUse("google")}");
}

class August1Solution {
    fun detectCapitalUse(word: String): Boolean {
        var capital:Boolean = false
       for(i in 0..(word.length-1)){
          if(i==0 ){
              if(word[i].isUpperCase())
                capital = true;
              else
                  return false;
          }else if(word[i].isUpperCase() && capital){
              continue;
          }else if(word[i].isLowerCase() && capital){
              if(i==1)
                capital = false;
              else
                  return false
          }else if(word[i].isLowerCase() && !capital){
              continue
          }else if (word[i].isUpperCase() && !capital){
              return false
          }
       }
        return true
    }
}