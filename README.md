# Vaadin 8 Grails 3 profile

This is a basic Grails 3 profile that enables Vaadin8-based development. Requires at least Grails 3.3.0.RC1

## Getting Started

### For versions of Grails 3.2.11 or lower

`grails create-app vaadin --profile me.przepiora.vaadin-grails:web-vaadin8:0.2`

The generated app contains a Vaadin UI component `grails-app/vaadin/vaadin/VaadinGrailsUI.groovy`

If you run the app

`./gradlew bootRun`

You will be able to see it in: 

`http://localhost:8080/vaadinui`

### For versions of Grails 3.3.0 or higher use

`grails create-app vaadin --profile me.przepiora.vaadin-grails:web-vaadin8:0.3`

The generated app contains a Vaadin UI component `src/main/groovy/vaadin/VaadinGrailsUI.groovy `

If you run the app

`./gradlew bootRun`

You will be able to see it in: 

`http://localhost:8080/vaadinUI`

## Common Issues

### Services are not getting injected in Vaadin components

Services are injected automatically into Vaadin components. You need annotate them with @Autowired to get them injected into Vaadin components. 

### I get `LazyInitializationException` when accessing domain classes associations in my Vaadin compponents 

When a Vaadin component calls a Grails service, once the service method completes, the Hibernate session is closed which means that any associations not loaded by the query could lead to a LazyInitializationException due to the closed session.

It is therefore critical that your queries always return the data that is required to render the view. This typically leads to better performing queries anyway and will in fact help you design a better performing application.

## Distribution

Vaadin 8 Grails Profile is distributed in [Bintray](https://bintray.com/macprzepiora/profiles/web-vaadin8)
