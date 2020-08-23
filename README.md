# spring-boot-graphql-integration
A POC using Spring Boot GraphQL Starter to implement/configure Spring Boot 2 integration with GraphQL.

### To Execute

1. Clone this repository;
2. In the root project directory, run ```mvn spring-boot:run``` to start the application;


### To Use
After doing the above steps:

1. Open your favorite browser and type http://localhost:8080/graphiql (the project uses GraphiQL).

### Examples

##### Queries
After Spring Boot application is running:

- Query approach:

```
query {

	retrieveAllPlayers { 
		name
		country
		position
	}

	retrievePlayerById(playerId: 6) { 
		name 
	}

	retrievePlayerByJerseyNumber(jerseyNumber: 10) { 
		name
	}

}
```

- Mutation approach:

```
mutation {
    
    updatePlayerJerseyById (
        inputPlayer: { 
            id: 8
            jerseyNumber: 11 
        }) 
    { 
        id
        name
        jerseyNumber
        position
        country 
    }

}
```