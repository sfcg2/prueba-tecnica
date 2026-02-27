export class Events { //aqui definimos para que la data que venga del backend pueda mapearse en el frontend

    constructor(
        public name: string,
        public description: string,
        public startDate: Date,
        public endDate: Date) {}
}
