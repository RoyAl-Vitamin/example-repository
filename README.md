# example-repository

Service has one GET-method `http://localhost:8080/hello?name=alex`

Port by default is `8080`. If you want to change port set port in environment variables `PORT` for docker only run command:

```shell
docker run -e PORT=8082 -p 8082:8082 rvitamin/example-repository
```

# Link

1. Link to check [work](http://localhost:8080/hello?name=alex)
2. Link to docker hub [image](https://hub.docker.com/r/rvitamin/example-repository)
3. How to start with docker [hub](https://docs.docker.com/docker-hub/quickstart/)
4. Install [kubectl](https://kubernetes.io/docs/tasks/tools/install-kubectl-linux/#install-using-native-package-management)
5. Deploy to [kubernetes](https://docs.docker.com/desktop/kubernetes/)
6. Inspired by [video](https://www.youtube.com/watch?v=JC_OyWpqNSA)
