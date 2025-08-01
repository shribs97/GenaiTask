# GenaiTask

/* 
Create a Spring Boot backend application for managing products using CRUD operations with JWT-based authentication and role-based access control. 
Use the following package structure: 
- com.example.productservice.entity → for the Product entity 
- com.example.productservice.repository → for the JPA repository 
- com.example.productservice.service → for business logic 
- com.example.productservice.controller → for REST API 
- com.example.productservice.security → for JWT filters, token provider, security config 
- com.example.productservice.dto → for request/response DTOs 
- com.example.productservice.exception → for custom exceptions 
Product entity should have: 
- id (Long), name (String), price (double), quantity (int) 
The ProductService should support: 
- createProduct, getAllProducts, getProductById, updateProduct, deleteProduct 
Security: 
- Use JWT authentication 
- Implement login and register endpoints 
- Use roles (ADMIN, USER) 
- Use method-level security with @PreAuthorize annotations 
Include: 
- JWT filter 
- SecurityConfig class using `HttpSecurity` 
- UserDetailsService for authentication 
- Exception handling for unauthorized access and missing products 
*/ 

/*
check sytax errors in project have or not
*/

/*
check dependancies and add requierd dependecies*/
