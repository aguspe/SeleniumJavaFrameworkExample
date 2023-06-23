# Java Selenium Framework with JUnit 5

This repository contains a Java Selenium automation framework that utilizes JUnit 5 for testing. The project is structured based on the Page Object Model (POM) design pattern. Additionally, it includes a GitHub Action for continuous integration.

## Features

- Selenium WebDriver for browser automation.
- JUnit 5 for test creation, management, and execution.
- Page Object Model (POM) pattern for maintaining a clean separation between test code and page-specific code.
- Maven for build management and dependency resolution.
- GitHub Action for automated testing on push or pull request to the main branch.

## Prerequisites

- Java Development Kit (JDK) 20 or higher
- Maven
- An IDE such as IntelliJ IDEA or Eclipse

## Installing Maven Dependencies

1. Clone this repository to your local machine.
2. Open a terminal/command prompt and navigate to the root directory of the project.
3. Execute the following Maven command to download and install all the dependencies specified in the `pom.xml` file:

    ```
    mvn clean install
    ```

## Page Object Model (POM)

This framework is built using the Page Object Model design pattern. POM helps in making the code more readable, maintainable, and reusable. Each web page in the application is represented as a Java class, and the various elements on the page are represented as variables in the class. All possible user interactions can then be implemented as methods in this class.

## GitHub Action for Continuous Integration

This repository includes a GitHub Action workflow for continuous integration. The workflow is configured to run on every push or pull request made to the main branch. It sets up the Java environment, installs all Maven dependencies, and runs the Selenium tests in a Chrome browser. To see this in action, check the "Actions" tab on the GitHub repository page.

## Contributing

Contributions are welcome. Please open an issue or submit a pull request for any contributions.

## License

[MIT License](LICENSE)
