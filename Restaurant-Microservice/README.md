# Restaurant Microservice

Listening on port: 8000

### Get all restaurants
curl --location --request GET 'http://localhost:8000/restaurants'

### Get a restaurant
curl --location --request GET 'http://localhost:8000/restaurants/1'

### Add a restaurant
curl --location --request POST 'http://localhost:8000/restaurants' \
--header 'Content-Type: application/json' \
--data-raw '{"name": "Sushi House", "cuisine":"Sushi", "rating":3, "review":"Good sushi"}'


### Access Swagger UI (in a browser)
http://localhost:8000/swagger-ui.html

### Access Database (h2) Console (in a browser)
http://localhost:8000/h2-console