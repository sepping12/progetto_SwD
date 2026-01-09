# Backend eCommerce Project using Spring Boot

## Description
The Backend eCommerce Project is a robust backend system for an online shopping platform. It handles essential functionalities like user authentication, product management, order processing, and data storage in a MySQL database. This project serves as the backbone of an eCommerce website.

Built with modern DevOps practices including CI/CD pipelines, Docker containerization, code coverage analysis, and security scanning.

## Table of Contents

- [Installation](#installation)
- [CI/CD & Build](#cicd--build)
- [Docker](#docker)
- [Technologies Used](#technologies-used)
- [Features](#features)
- [Usage](#usage)
- [Contributing](#contributing)

## Installation

To get started with our E-commerce Backend App, follow these steps:

1. **Clone the repository:**

   ```bash
   git clone https://github.com/Shittu24/ecommerce-backend.git
   cd ecommerce-backend
   ```

2. **Set up MySQL Database (Optional - H2 used by default):**
   - Ensure you have MySQL installed on your system.
   - Create a MySQL database for the application.
   - Update the database configuration in `src/main/resources/application.properties` with your database settings:
  
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     ```

3. **Build and run the application:**

   ```bash
   ./mvnw clean install
   ./mvnw spring-boot:run
   ```

The application should now be up and running on `http://localhost:8080`.

## CI/CD & Build

### Local Build
```bash
mvn clean install
```

**Requirements**:
- Java 17+ (Temurin JDK)
- Maven 3.9+

**Output**: 
- `target/spring-boot-ecommerce-0.0.1-SNAPSHOT.jar`
- JaCoCo coverage report: `target/site/jacoco/index.html`

### GitHub Actions Workflows

#### 1. **ci.yml** - Continuous Integration
Triggered on: `push` to main/develop, `pull_request`

**What it does**:
- Builds the project with Maven
- Runs all tests (JUnit 5)
- Generates JaCoCo coverage reports
- Comments PRs with coverage metrics
- (Optional) Scans code with SonarCloud

**Required Secrets** (optional):
- `SONAR_TOKEN` - for SonarCloud integration

#### 2. **build.yml** - Docker Build & Push
Triggered on: `push` to main/develop/tags, `pull_request`

**What it does**:
- Builds Docker image using multi-stage build
- Pushes to DockerHub with semantic versioning
- Tags: `latest`, branch name, semantic version, commit SHA
- Caches layers for faster builds

**Required Secrets**:
- `DOCKER_USERNAME` - your DockerHub username
- `DOCKER_PASSWORD` - your DockerHub password

**To configure**, add secrets in GitHub repository settings:
```
Settings > Secrets and variables > Actions > New repository secret
```

## Docker

### Build Image Locally
```bash
docker build -t ecommerce-api:latest .
```

### Run Container
```bash
docker run -p 8080:8080 ecommerce-api:latest
```

### Docker Compose (Full Stack)
```bash
docker-compose up
```

This starts the Spring Boot application with:
- Application on port 8080
- H2 in-memory database
- Health checks enabled
- Non-root security context

**Dockerfile Features**:
- Multi-stage build (Maven builder → Runtime)
- Eclipse Temurin 21 Alpine (lightweight, 50MB+)
- Health checks via Spring Actuator
- Non-root user (appuser) for security
- Optimized layer caching

## Technologies Used
- **Java**: 17 - Primary programming language
- **Spring Boot**: 3.1.3 - Framework for building Java applications
- **Spring Data JPA**: Database operations
- **Spring Data REST**: RESTful APIs
- **Spring Boot Actuator**: Health checks and monitoring
- **MySQL**: Relational database (optional)
- **H2**: In-memory database (default)
- **Lombok**: Boilerplate code generation
- **Spring MVC**: HTTP request handling
- **JUnit 5**: Testing framework
- **JaCoCo**: Code coverage analysis
- **Docker**: Containerization
- **Maven**: Build automation
- **Maven**: Dependency management.

## Features

Our E-commerce Backend App offers a comprehensive set of features to support a seamless online shopping experience:

- **Order Management**: Create, retrieve, and manage customer orders efficiently.
- **Product Inventory**: Keep track of available products and their details.
- **Customer Management**: Manage customer information and profiles.
- **Order Tracking**: Assign and track unique order tracking numbers.
- **Secure Authentication**: Implement secure user authentication and access control.
- **API Integration**: Interact with external APIs to retrieve product information.
- **Payment Gateway Integration**: Seamlessly integrate payment gateways for order processing.
- **Location Management**: Store and manage location data for shipping and fulfillment.
- **Database Storage**: Utilize a MySQL database to store and manage order data.
- **Testing and Quality Assurance**: Rigorous testing and quality checks to ensure reliability.

We are continually enhancing our app with new features and improvements to provide a comprehensive e-commerce solution.



## Usage
1. Access the API endpoints to interact with the backend.
   - Product Management: `/api/products`
   - Product Categories: `/api/product-category`
   - Selected Countries: `/api/countries`
   - States Management: `/api/states`
2. Create an Order:
      - HTTP Method: POST
      - Endpoint: `/api/checkout/purchase`
      - Request Body Example:
        ```json
        {
            "customer":{
               "firstName":"afasa",
               "lastName":"afasa",
               "email":"afasa@test.com"
            },
            "shippingAddress":{
               "street":"afasa",
               "city":"afasa",
               "state":"Alberta",
               "country":"Canada",
               "zipCode":"afasa"
            },
            "billingAddress":{
               "street":"fsfsf",
               "city":"sfdsf",
               "state":"Acre",
               "country":"Brazil",
               "zipCode":"19111"
            },
            "order":{
               "totalPrice":36.98,
               "totalQuantity":2
            },
            "orderItems":[
               {
                  "imageUrl":"assets/images/products/coffeemugs/coffeemug-luv2code-1000.png",
                  "quantity":1,
                  "unitPrice":18.99,
                  "productId":26
               },
               {
                  "imageUrl":"assets/images/products/mousepads/mousepad-luv2code-1000.png",
                  "quantity":1,
                  "unitPrice":17.99,
                  "productId":51
               }
            ]
         }

    - Response Example:
      ```json
      {
          "orderTrackingNumber": "997e311f-be72-4c45-98ac-86e5541f4c5e"
      }
                 

## Contributing
Contributions are welcome! If you'd like to contribute to this project, please follow these guidelines:
- Fork the repository.
- Create a new branch for your feature or bug fix.
- Make your changes and submit a pull request.
  

## Contact
For questions or support, please contact [Ibrahim](mailto:ibrahimshittu007@gmail.com).
