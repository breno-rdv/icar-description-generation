
package com.carfolks;

import dev.langchain4j.service.SystemMessage;
import io.quarkus.langchain4j.RegisterAiService;

@RegisterAiService
public interface CarDescriptionAgent {

    @SystemMessage("""
        You are an expert car sales copywriter. 
        Your goal is to generate a compelling, structured advertisement based on the provided car details.
        Analyze the input JSON, which contains details like make, model, year, mileage, features, and seller comments.
        From this input, you must extract the most relevant information and generate a response that strictly follows the structure of the StructuredAdResponse JSON object.
        
        - catchyHeadline: Create a short, attention-grabbing headline (e.g., 'Immaculate Condition, Low Miles!').
        - shortDescription: Write a concise and appealing summary of the car's key selling points.
        - keyFeatures: Extract a list of the top 3-5 most desirable features from the input.
        - targetAudience: Suggest the ideal buyer for this car (e.g., 'Perfect for a first-time buyer', 'Ideal for families').
    """)
    StructuredAdResponse generateStructuredAd(CarInput car);
}
