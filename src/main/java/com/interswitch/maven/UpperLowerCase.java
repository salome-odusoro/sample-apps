package com.interswitch.maven;

public class UpperLowerCase {

    public String wordToUpperCase(String word){
        if (word != null && !word.isEmpty()){
            String[] splittedWord = word.split(" ");
            return splittedWord[0].toUpperCase();
        }else{
            throw new IllegalArgumentException("Word cannot be empty");
        }
    }

    public String wordToLowerCase(String word){
        if (word != null && !word.isEmpty()){
            String[] splittedWord = word.split(" ");
            return splittedWord[0].toLowerCase();
        }else{
            throw new IllegalArgumentException("Word cannot be empty");
        }
    }
}
