# especialista-spring-rest-algaworks
This repository contains all lessons that i learned in each lesson. For each lesson, i make a commit specify what i done in code. This way its easy to revise the content of lesson when i need remember insted need watch the lesson again.

#### 8.23. Desafio: tratando a PropertyBindingException na desserialização

- **PropertyBindingException**: Base class for JsonMappingExceptions that are specifically related 
to problems related to binding an individual property.

- **IgnoredPropertyException**: Specialized JsonMappingException sub-class used to indicate case where an explicitly ignored property is encountered,
  and mapper is configured to consider this an error.

- **UnrecognizedPropertyException**: Specialized JsonMappingException sub-class specifically used to indicate 
problems due to encountering a JSON property that could not be mapped to an Object property (via getter, constructor argument or field).

#### 8.25. Desafio: tratando exception de parâmetro de URL inválido

- **MethodArgumentTypeMismatchException**: Exception that indicates that a method argument has not the expected type. 
- ProblemType problem = ProblemType.PARAMETRO_INVALIDO;
- Mensagem da respsosta HTTP: O parâmetro de URL '%s' recebeu o valor '%s', que é de um tipo inválido. Corrija e informa um valor
comtaível com o tipo %s.

#### 8.26. Desafio: tratando a exceção NoHandlerFoundException  - to not found url

- **NoHandlerFoundException**: By default, when the DispatcherServlet can't find a handler for a 
request it sends a 404 response. However, if its property "throwExceptionIfNoHandlerFound" 
is set to true this exception is raised and may be handled with a configured.
- Its need configure spring to albe the throw this exception.
HandlerExceptionResolver.
- The method is present in ResponseEntityExceptionHandler super classe, just only overwrite this method
and adapt your return to private method handleExceptionInternal. Don't need use the @ExceptionHandler
to catch this method.

#### 8.27. Desafio: tratando outras exceções não capturadas
- Create method handler to catch Exception
- Message: Ocorreu um erro interno inesperado no sistema. Tente novamente e se o problema persistir
entre em contato com o administrador do sistema.