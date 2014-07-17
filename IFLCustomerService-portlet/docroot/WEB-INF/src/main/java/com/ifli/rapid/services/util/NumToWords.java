package com.ifli.rapid.services.util;

import java.util.*;

import org.apache.log4j.Logger;

public class NumToWords {
	static Logger logger = Logger.getLogger(NumToWords.class);
        static String string;
        private static final String st1[] = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
                        "Eight", "Nine", };
        private static final String st2[] = { "Hundred", "Thousand", "Lakh", "Crore" };
        private static final String st3[] = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
                        "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninteen", };
        private static final String st4[] = { "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
                        "Eighty", "Ninety" };
          
        public static String convertNumberToWords(String number){
        	logger.info("NumToWords.convertNumberToWords().Method Execution Started");
    		if(number == null){
    			number = "0";
    		}
    		String finalWord = "";
    		if(number != null){
    			if(number.contains(".")){
    				number = number.substring(0, (number.indexOf(".")));
    			
    			}
    			StringTokenizer st = new StringTokenizer(number, ",");
    			StringBuffer sb = new StringBuffer();
    			while(st.hasMoreTokens()){
    				sb.append(st.nextToken());
    			}
    			
    			number = sb.toString();
    			
    			if (number.contains(".")) {
    				finalWord = "Invalid Amount";
    			} else {
    				finalWord = convert(Long.parseLong(number));
    			}
    		}
    		return finalWord;
    	}
        
        
        public static String convert(Long number) {
        	logger.info("NumToWords.convert.Method Execution Started");
                int n = 1;
                Long word;
                string = "";
                while (number != 0) {
                	
                        switch (n) {
                        case 1:
                                word = number % 100;
                              
                                pass(word);
                                if (number > 100 && number % 100 != 0) {
                                        show("and ");
                                }
                                number /= 100;
                              
                                break;

                        case 2:
                                word = number % 10;
                              
                                if (word != 0) {
                                        show(" ");
                                        show(st2[0]);
                                        show(" ");
                                        pass(word);
                                }
                                number /= 10;
                              
                                break;

                        case 3:
                                word = number % 100;
                              
                                if (word != 0) {
                                        show(" ");
                                        show(st2[1]);
                                        show(" ");
                                        pass(word);
                                }
                                number /= 100;
                             
                                break;

                        case 4:
                                word = number % 100;
                                logger.debug("Word in case 4:"+word);
                                if (word != 0) {
                                        show(" ");
                                        show(st2[2]);
                                        show(" ");
                                        pass(word);
                                }
                                number /= 100;
                              
                                break;

                        case 5:
                                word = number % 100;
                               
                                if (word != 0) {
                                        show(" ");
                                        show(st2[3]);
                                        show(" ");
                                        pass(word);
                                }
                                number /= 100;
                             
                                break;

                        }
                        n++;
                }
                return string;
        }

        public static void pass(Long number) {
        	logger.info("NumToWords.pass().Method Execution Started");
        	
                Long word, q;
                if (number < 10) {
                        show(st1[number.intValue()]);
                }
                if (number > 9 && number < 20) {
                        show(st3[number.intValue() - 10]);
                }
                if (number > 19) {
                        word = number % 10;
                        if (word == 0) {
                                q = number / 10;
                                show(st4[q.intValue() - 2]);
                        } else {
                                q = number / 10;
                                show(st1[word.intValue()]);
                                show(" ");
                               
                                show(st4[q.intValue() - 2]);
                        }
                }
        }

        public static void show(String s) {
        	logger.info("NumToWords.show().Method Execution Started");
        	
                String st;
                st = string;
                string = s;
                string += st;
              
        }

}