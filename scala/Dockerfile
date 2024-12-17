FROM openjdk:8

# Install Scala
ENV SCALA_VERSION 2.12.15
ENV SCALA_HOME /usr/share/scala
ENV PATH $PATH:$SCALA_HOME/bin
RUN \
  cd /tmp && \
  curl -Lo scala-${SCALA_VERSION}.tgz https://downloads.typesafe.com/scala/${SCALA_VERSION}/scala-${SCALA_VERSION}.tgz && \
  tar xf scala-${SCALA_VERSION}.tgz && \
  mv scala-${SCALA_VERSION} ${SCALA_HOME} && \
  rm scala-${SCALA_VERSION}.tgz

# Set the working directory
WORKDIR /app

# Copy the Scala source code into the container
COPY HelloWorld.scala .

# Compile the Scala source code
RUN scalac HelloWorld.scala

# Set the entrypoint
CMD ["scala", "HelloWorld"]