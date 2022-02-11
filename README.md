# InMemoryFileSytem

## Run the application in local environment

Navigate to Application.java and run the application from any IDE. I used intellij Idea. The application should be running in localhost:8080

## Supported Operations

### Create file

Endpoint: `POST` http://localhost:8080/file/ 

Payload:
``` 
{
    "name" : <file_name>,
    "content" : <file_content>
}
```
### Read file

Endpoint: `GET` http://localhost:8080/file/<file_name>?start=<start_value>&offset=<offset>

```$xslt
  <file_name> : Already inserted file name
  <start_value> : start_index of the file content
  <offset> : The number of characters to read
```

### Update file

Endpoint: `PUT` http://localhost:8080/file/<file_name>

PayLoad:

```$xslt
{
    "content" : "file_content",
    "isAppend" : "true/false"
}
```

file content will be appended/replaced based on isAppend parameter and true/false respectively.

### Delete a file

Endpoint: `DEL` http://localhost:8080/file/<file_name> 

```$xslt
 <file_name> : Existing filename to be deleted.
```

### To Do Items
```$xslt
1. Exception Handling
2. Synchronization
3. Unit Testing
```
