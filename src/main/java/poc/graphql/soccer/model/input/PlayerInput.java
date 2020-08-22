package poc.graphql.soccer.model.input;

import graphql.schema.GraphQLInputType;
import lombok.Data;

@Data
public class PlayerInput implements GraphQLInputType {

    private static final String INPUT_NAME = "PlayerInput";

    Integer id;
    String name;
    String position;
    Integer jerseyNumber;

    @Override
    public String getName() {
        return INPUT_NAME;
    }

}
