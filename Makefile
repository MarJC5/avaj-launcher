# Compiler
JAVAC = javac

# Java runtime
JAVA = java

# Source directory
SRC_DIR = src

# Class output directory
BIN_DIR = bin

# Main class (fully qualified with package name)
MAIN_CLASS = ro.academyplus.avaj.simulator.Simulator

# Find all the .java files in the source directory
SOURCES = $(shell find $(SRC_DIR) -name "*.java")

# Create a list of .class files from the .java files
CLASSES = $(SOURCES:$(SRC_DIR)/%.java=$(BIN_DIR)/%.class)

# Default rule
all: compile

# Rule to compile all the Java files
compile: $(CLASSES)

# Rule to create the bin directory if it does not exist
$(BIN_DIR)/%.class: $(SRC_DIR)/%.java
	@mkdir -p $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) $<

# Clean up .class files
clean:
	rm -rf $(BIN_DIR)

# Run the project
run: compile
	$(JAVA) -cp $(BIN_DIR) $(MAIN_CLASS) $(ARGS)

# PHONY targets (not actual files)
.PHONY: all compile clean run

# How to run the project
# make run ARGS="scenario.txt"