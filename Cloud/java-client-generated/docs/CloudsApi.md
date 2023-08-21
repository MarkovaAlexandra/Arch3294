# CloudsApi

All URIs are relative to *https://localhost:8080/api/vi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelCloudById**](CloudsApi.md#cancelCloudById) | **DELETE** /clouds/{cloud_id} | отмена заказа в облаке по id
[**createCloud**](CloudsApi.md#createCloud) | **POST** /clouds | Создает заказ в облаке
[**createOrderById**](CloudsApi.md#createOrderById) | **GET** /clouds/{cloud_id} | создание заказа по id облака
[**getAllClouds**](CloudsApi.md#getAllClouds) | **GET** /clouds | Метод получение списка ресурсов на облаке

<a name="cancelCloudById"></a>
# **cancelCloudById**
> cancelCloudById(cloudId)

отмена заказа в облаке по id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
String cloudId = "cloudId_example"; // String | идентификатор заказа в облаке
try {
    apiInstance.cancelCloudById(cloudId);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#cancelCloudById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudId** | **String**| идентификатор заказа в облаке |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: aplication/json

<a name="createCloud"></a>
# **createCloud**
> Cloud createCloud()

Создает заказ в облаке

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
try {
    Cloud result = apiInstance.createCloud();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#createCloud");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Cloud**](Cloud.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: aplication/json

<a name="createOrderById"></a>
# **createOrderById**
> createOrderById(cloudId)

создание заказа по id облака

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
String cloudId = "cloudId_example"; // String | идентификатор облака
try {
    apiInstance.createOrderById(cloudId);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#createOrderById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudId** | **String**| идентификатор облака |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: aplication/json, application/json

<a name="getAllClouds"></a>
# **getAllClouds**
> Cloud getAllClouds()

Метод получение списка ресурсов на облаке

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
try {
    Cloud result = apiInstance.getAllClouds();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#getAllClouds");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Cloud**](Cloud.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: aplication/json

