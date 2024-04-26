package org.example;

import java.util.ArrayList;
//import com.fasterxml.jackson.annotation.JsonProperty
public class Data {

    // import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */

    public class Response{
        public Request request;
    }
    public class Request{
        public String requestName;
        public String requestNumber;
        public String projectNumber;
        public String clientName;
        public String requestedUser;
        public String documentation;
        public String comments;
        public String history;
        public String status;
        public String description;
        public String assignedTo;
        public String productionMode;
        public String notificationType;
        public Formula formula;
        public LabelManagement labelManagement;
        public ShippingManagement shippingManagement;
    }

    public class Formula{
        public String formulaName;
        public String description;
        public String stockSystemLocation;
        public String realTimeLocation;
        public String stockStatus;
        public String quantityLeft;
        public String requestedQuantity;
        public String lastCheckout;
        public String lastCheckin;
        public Service service;
    }

    public class Service{
        public String serviceType;
        public String serviceCategory;
        public String serviceName;
        public int cycle;
        public String dayInterval;
        public String result;
        public String bookedEquipment;
        public String bookingDate;
        public int systemRank;
        public String availabilityStatus;
        public ArrayList<IngredientsMeasurement> ingredientsMeasurements;
    }
    public class IngredientsMeasurement{
        public ArrayList<Ingredient> ingredients;
        public Measurement measurement;
    }

    public class Ingredient{
        public String ingredientType;
        public String ingredientName;
        public String ingredientMaterial;
        public String ingredientSize;
        public String ingredientQuantity;
    }

    public class Measurement{
        public String measurementName;
        public String olfactiveCarachteristics;
        public String fragranceIntensity;
        public String baseOudourCoverage;
        public String physicalAspect;
        public String finaldiscoloration;
        public String personalized;
    }


    public class LabelManagement{
        public String labelManagementName;
        public String clientName;
        public String applicationType;
        public Fragrance fragrance;
        public Base base;
        public Packaging packaging;
    }

    public class Fragrance{
        public String fragranceCode;
        public String fragranceName;
        public String fragranceBatch;
        public String fragranceDosage;
        public String beginDateOfFragrance;
        public String endDateOfFragrance;
    }
    public class Base{
        public String baseName;
        public String baseCode;
        public String baseBatch;
        public String beginDateOfBase;
        public String endDateOfBase;
    }

    public class Packaging{
        public String packagingCode;
        public String packagingName;
        //@JsonProperty("Additives")
        public String additives;
    }

//@Entity
    public class ShippingManagement{
        public String shippingManagementName;
        public String totalApplication;
        public ArrayList<SamplesSummary> samplesSummaries;
    }


    public class SamplesSummary{
        public String sendTo;
        public Object samplesNumbers;
        public String description;
    }

public void readJson(){
         /* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
}
}
