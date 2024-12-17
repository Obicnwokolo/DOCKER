from pyspark.sql import SparkSession

spark = SparkSession.builder.appName("AdditionApp").getOrCreate()

a = 10
b = 20

result = a + b

print(f"The result of {a} + {b} is {result}")

spark.stop()