package com.ligarisma


@grails.compiler.GrailsCompileStatic
class Product {

     String category;

     List<String> categoryStructure = null;

     String name;

     String city;

     String province;

     Double price;

     List<String> images = null;

     List<String> smallImages = null;

     String url;

     String desc;

     String condition;

     Boolean nego;

     String sellerName;

     Boolean paymentReady;

     Integer stock;

     //Specification specification;

     List<Object> stateDescription = null;

    static constraints = {
       //  specification nullable: true
    }
}
