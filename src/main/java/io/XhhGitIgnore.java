package io;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.PetApi;


public class XhhGitIgnore {
  public static void main(String[] args) {
ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: petstore_auth
OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

PetApi apiInstance = new PetApi();
/*
Pet body = new Pet(); // Pet | Pet object that needs to be added to the store
try {
    apiInstance.addPet(body);
} catch (ApiException e) {
    System.err.println("Exception when calling PetApi#addPet");
    e.printStackTrace();
}
*/

Long petId = 1L; // Long | ID of pet that needs to be fetched
try {
      Pet result = apiInstance.getPetById(petId);
          System.out.println(result);
} catch (ApiException e) {
      System.err.println("Exception when calling PetApi#getPetById");
          e.printStackTrace();
}

  }
}
