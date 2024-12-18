# Use the official Python image
FROM python:3.9

# Set the working directory
WORKDIR /app

# Copy the requirements to install dependencies
COPY requirements.txt .

# Install dependencies
RUN pip install --no-cache-dir -r requirements.txt

# Copy the API source code into the container
COPY . .

# Expose the port on which the app runs
EXPOSE 2020

# Define the command to run the app
CMD ["python", "app.py"]
