# especialista-spring-rest-algaworks
This repository contains all lessons that i learned in each lesson. For each lesson, i make a commit specify what i done in code. This way its easy to revise the content of lesson when i need remember insted need watch the lesson again.

#### 8.23. Desafio: tratando a PropertyBindingException na desserialização

- **PropertyBindingException**: Base class for JsonMappingExceptions that are specifically related 
to problems related to binding an individual property.

- **IgnoredPropertyException**: Specialized JsonMappingException sub-class used to indicate case where an explicitly ignored property is encountered,
  and mapper is configured to consider this an error.

- **UnrecognizedPropertyException**: Specialized JsonMappingException sub-class specifically used to indicate 
problems due to encountering a JSON property that could not be mapped to an Object property (via getter, constructor argument or field).

