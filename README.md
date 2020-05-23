# spotify-layer
## Docker
The prefered and planned Deployment is via Docker.

`docker run -d -p <PORT>:8080 -e SPOTIFY_CLIENT_ID=<CLIENT_ID> -e SPOTIFY_CLIENT_SECRET=<CLIENT_SECRET> spotify-layer`

The variables in this command need to be replaced logically

### Umgebungsvariablen
| Variable | Default value | Description |
|---|---|---|
| SPOTIFY_CLIENT_ID | / | The OAuth-ID of the Spotify-API|
| SPOTIFY_CLIENT_SECRET | / | The OAuth-Secret of the Spotify-API|

### ID and Secret of Spotify-API
These are avaible at the [Developer Dashbpard from Spotify](https://developer.spotify.com/dashboard). They need to be generated for a specific Account.


