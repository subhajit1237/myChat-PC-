# myChat-PC-
A socket based chatting application for PCs

# Environment setup-
1. Directly clone the project to any IDE using IDE specific options. YOu might need to create a new project and clone the repo into that project incase the classpath doesnt show up.
2. Clone it into some directory if you wish to directly edit it(NOT RECOMMENDED).
3. JavaSE-16 support is necessary to run this project and shouldn't be altered .
4. This project uses java-fx support to draw the gui.
5. Java-FX for Windows, macOS and Linux(All distros) support libraries can be found here https://gluonhq.com/products/javafx/
6. For any OS, be sure to configure the build-path of the project(classpath if you use text editors). Import all the libraries under the os specific javafx/bin folder into your buildpath/classpath.
7. For changing the GUI, it is recommended that you set up SceneBuilder into your machine and use it to modify the fxml files.
8. Once done, happy coding!

# The framework-
1. This project uses the Model-View-Controller(MVC) framework.
2. All of the GUI elements are stored under the view package.
3. All of the data storage code is stored under the model package.
4. All of the binding classes are stored under the controller package.
5. Any other utility code that might be needed should be stored under the utils package.
6. The fxml codes for the GUI are stored under the layouts package.
7. No such coding rules except following the mvc pattern. KEEP THE CODE PRECISE AND MODULAR.

# Commit rules-
1. changelog.log file exists under the root folder of this project.
2. For every major or minor change, under the version number mention the changes in the changelog.log file.
3. Pulls would be made accordingly.
