export class LoginResponse {
    constructor(
        public IdToken: string,
        public email: string,
        public refreshToken: string,
        public expiresIn: string,
        public localId: string,
        public registered: boolean
    ) { }
}
