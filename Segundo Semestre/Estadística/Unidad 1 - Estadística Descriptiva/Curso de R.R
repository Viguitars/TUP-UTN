# Concatenate Elements
text <- "awesome"

paste("R is", text)

text1 <- "R is"
text2 <- "awesome"

paste(text1, text2)

# Assign the same value to multiple variables in one line
var1 <- var2 <- var3 <- "Orange"

# Print variable values
var1
var2
var3

# Legal variable names:
myvar <- "Víctor"
my_var <- "Víctor"
myVar <- "Víctor"
MYVAR <- "Víctor"
myvar2 <- "Víctor"
.myvar <- "Víctor"

# Ilegal variable names:
2myvar <- "Víctor"
my-var <- "Víctor"
my var <- "Víctor"
_my_var <- "Víctor"
my_v@ar <- "Víctor"
TRUE <- "Víctor"

# Data Types
my_var <- 30 # my_var is type of numeric
my_var <- "Sally" # my_var in now of type character (aka string)

# numeric
x <- 10.5
class(x)

#integer
x <- 100L
class(x)

# complex
x <- 9i + 3
class(x)

#character/string
x <- "R is exciting"
class(x)

#logical/boolean
x <- TRUE
class(x)

# Numbers

