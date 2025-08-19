# iCar Description Generation API

This project is a Quarkus-based REST API that uses an AI agent powered by Amazon Bedrock and LangChain4j to generate compelling, structured advertisements for cars.

You provide detailed information about a car in a JSON format, and the API returns a structured JSON object containing a catchy headline, a short description, key features, and the target audience for the ad.

## Prerequisites

Before you begin, ensure you have the following installed:

- Java 17 or later
- Apache Maven 3.8.2 or later
- An active AWS account with access to Amazon Bedrock

## 1. Configuration

There are two main configuration steps:

### a) AWS Credentials

The application needs valid AWS credentials to communicate with Bedrock. The recommended way is to configure your default AWS profile by creating or editing the `~/.aws/credentials` file:

```ini
[default]
aws_access_key_id = YOUR_AWS_ACCESS_KEY
aws_secret_access_key = YOUR_AWS_SECRET_KEY
```

Alternatively, you can set environment variables.

### b) Application Properties

Edit the `src/main/resources/application.properties` file to set your specific Bedrock configuration:

```properties
# The AWS region where your Bedrock models are enabled
quarkus.langchain4j.bedrock.aws.region=us-east-1

# The ID of the model you want to use
# Make sure you have granted access to this model in the Bedrock console.
quarkus.langchain4j.bedrock.model.id=anthropic.claude-3-sonnet-20240229-v1:0
```

## 2. Running the Application

You can run the application in development mode, which enables live coding.

```bash
./mvnw quarkus:dev
```

The API will be available at `http://localhost:8080`.

## 3. Using the API

You can send a `POST` request to the `/api/generate-description` endpoint with the car's details. 

Here is an example using `curl`:

```bash
curl -X POST -H "Content-Type: application/json" -d '{ 
  "make": "Toyota",
  "model": "Camry",
  "year": 2022,
  "mileage": 15000,
  "color": "Midnight Black Metallic",
  "bodyType": "Sedan",
  "engine": {
    "type": "2.5L 4-Cylinder",
    "fuelType": "Gasoline"
  },
  "transmission": {
    "type": "Automatic",
    "gears": 8
  },
  "features": [
    "Apple CarPlay",
    "Android Auto",
    "Blind Spot Monitor",
    "Toyota Safety Sense 2.5+",
    "Power Moonroof"
  ],
  "condition": "Excellent",
  "history": "One owner, no accidents, clean title.",
  "sellerComments": "This car has been garage-kept and meticulously maintained. All service records are available. It is a non-smoker car and is in like-new condition."
}' http://localhost:8080/api/generate-description
```

### Example Response

You will receive a structured JSON response like this:

```json
{
  "catchyHeadline": "Like-New 2022 Toyota Camry - Low Mileage & Loaded!",
  "shortDescription": "Experience reliability and style with this meticulously maintained 2022 Toyota Camry. With only 15,000 miles and a single owner, this vehicle is in excellent, like-new condition and comes packed with modern safety and entertainment features.",
  "keyFeatures": [
    "Toyota Safety Sense 2.5+",
    "Apple CarPlay & Android Auto",
    "Power Moonroof",
    "Blind Spot Monitor"
  ],
  "targetAudience": "Commuters or anyone seeking a reliable and fuel-efficient sedan."
}
```