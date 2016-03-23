# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

After the client library is installed/deployed, you can use it in your Maven project by adding the following to your *pom.xml*:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import .;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: petstore_auth
OAuth petstore_auth = defaultClient.getAuthentication("petstore_auth");
petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: test_api_client_id
ApiKeyAuth test_api_client_id = defaultClient.getAuthentication("test_api_client_id");
test_api_client_id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//test_api_client_id.setApiKeyPrefix("Token");

// Configure API key authorization: test_api_client_secret
ApiKeyAuth test_api_client_secret = defaultClient.getAuthentication("test_api_client_secret");
test_api_client_secret.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//test_api_client_secret.setApiKeyPrefix("Token");

// Configure API key authorization: api_key
ApiKeyAuth api_key = defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: test_http_basic
HttpBasicAuth test_http_basic = (HttpBasicAuth) defaultClient.getAuthentication("test_http_basic");
test_http_basic.setUsername("YOUR USERNAME");
test_http_basic.setPassword("YOUR PASSWORD");

// Configure API key authorization: test_api_key_query
ApiKeyAuth test_api_key_query = defaultClient.getAuthentication("test_api_key_query");
test_api_key_query.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//test_api_key_query.setApiKeyPrefix("Token");

// Configure API key authorization: test_api_key_header
ApiKeyAuth test_api_key_header = defaultClient.getAuthentication("test_api_key_header");
test_api_key_header.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//test_api_key_header.setApiKeyPrefix("Token");

 apiInstance = new ();
try {
    apiInstance.();
} catch (ApiException e) {
    System.err.println("Exception when calling #");
    e.printStackTrace();
}
```

## Documentation for API Endpoints

All URIs are relative to *http://petstore.swagger.io/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*.PetApi* | [**addPet**](docs/PetApi.md#addPet) | **POST** /pet | Add a new pet to the store
*.PetApi* | [**addPetUsingByteArray**](docs/PetApi.md#addPetUsingByteArray) | **POST** /pet?testing_byte_array=true | Fake endpoint to test byte array in body parameter for adding a new pet to the store
*.PetApi* | [**deletePet**](docs/PetApi.md#deletePet) | **DELETE** /pet/{petId} | Deletes a pet
*.PetApi* | [**findPetsByStatus**](docs/PetApi.md#findPetsByStatus) | **GET** /pet/findByStatus | Finds Pets by status
*.PetApi* | [**findPetsByTags**](docs/PetApi.md#findPetsByTags) | **GET** /pet/findByTags | Finds Pets by tags
*.PetApi* | [**getPetById**](docs/PetApi.md#getPetById) | **GET** /pet/{petId} | Find pet by ID
*.PetApi* | [**getPetByIdInObject**](docs/PetApi.md#getPetByIdInObject) | **GET** /pet/{petId}?response=inline_arbitrary_object | Fake endpoint to test inline arbitrary object return by &#39;Find pet by ID&#39;
*.PetApi* | [**petPetIdtestingByteArraytrueGet**](docs/PetApi.md#petPetIdtestingByteArraytrueGet) | **GET** /pet/{petId}?testing_byte_array=true | Fake endpoint to test byte array return by &#39;Find pet by ID&#39;
*.PetApi* | [**updatePet**](docs/PetApi.md#updatePet) | **PUT** /pet | Update an existing pet
*.PetApi* | [**updatePetWithForm**](docs/PetApi.md#updatePetWithForm) | **POST** /pet/{petId} | Updates a pet in the store with form data
*.PetApi* | [**uploadFile**](docs/PetApi.md#uploadFile) | **POST** /pet/{petId}/uploadImage | uploads an image
*.StoreApi* | [**deleteOrder**](docs/StoreApi.md#deleteOrder) | **DELETE** /store/order/{orderId} | Delete purchase order by ID
*.StoreApi* | [**findOrdersByStatus**](docs/StoreApi.md#findOrdersByStatus) | **GET** /store/findByStatus | Finds orders by status
*.StoreApi* | [**getInventory**](docs/StoreApi.md#getInventory) | **GET** /store/inventory | Returns pet inventories by status
*.StoreApi* | [**getInventoryInObject**](docs/StoreApi.md#getInventoryInObject) | **GET** /store/inventory?response=arbitrary_object | Fake endpoint to test arbitrary object return by &#39;Get inventory&#39;
*.StoreApi* | [**getOrderById**](docs/StoreApi.md#getOrderById) | **GET** /store/order/{orderId} | Find purchase order by ID
*.StoreApi* | [**placeOrder**](docs/StoreApi.md#placeOrder) | **POST** /store/order | Place an order for a pet
*.UserApi* | [**createUser**](docs/UserApi.md#createUser) | **POST** /user | Create user
*.UserApi* | [**createUsersWithArrayInput**](docs/UserApi.md#createUsersWithArrayInput) | **POST** /user/createWithArray | Creates list of users with given input array
*.UserApi* | [**createUsersWithListInput**](docs/UserApi.md#createUsersWithListInput) | **POST** /user/createWithList | Creates list of users with given input array
*.UserApi* | [**deleteUser**](docs/UserApi.md#deleteUser) | **DELETE** /user/{username} | Delete user
*.UserApi* | [**getUserByName**](docs/UserApi.md#getUserByName) | **GET** /user/{username} | Get user by user name
*.UserApi* | [**loginUser**](docs/UserApi.md#loginUser) | **GET** /user/login | Logs user into the system
*.UserApi* | [**logoutUser**](docs/UserApi.md#logoutUser) | **GET** /user/logout | Logs out current logged in user session
*.UserApi* | [**updateUser**](docs/UserApi.md#updateUser) | **PUT** /user/{username} | Updated user


## Documentation for Models

 - [Category](docs/Category.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [Model200Response](docs/Model200Response.md)
 - [ModelReturn](docs/ModelReturn.md)
 - [Name](docs/Name.md)
 - [Order](docs/Order.md)
 - [Pet](docs/Pet.md)
 - [SpecialModelName](docs/SpecialModelName.md)
 - [Tag](docs/Tag.md)
 - [User](docs/User.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### petstore_auth

- **Type**: OAuth
- **Flow**: implicit
- **Authorizatoin URL**: http://petstore.swagger.io/api/oauth/dialog
- **Scopes**: 
  - write:pets: modify pets in your account
  - read:pets: read your pets

### test_api_client_id

- **Type**: API key
- **API key parameter name**: x-test_api_client_id
- **Location**: HTTP header

### test_api_client_secret

- **Type**: API key
- **API key parameter name**: x-test_api_client_secret
- **Location**: HTTP header

### api_key

- **Type**: API key
- **API key parameter name**: api_key
- **Location**: HTTP header

### test_http_basic

- **Type**: HTTP basic authentication

### test_api_key_query

- **Type**: API key
- **API key parameter name**: test_api_key_query
- **Location**: URL query string

### test_api_key_header

- **Type**: API key
- **API key parameter name**: test_api_key_header
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

apiteam@swagger.io

